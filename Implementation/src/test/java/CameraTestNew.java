import org.example.Camera;
import org.example.r03.MemoryCardHash;
import org.example.r04.AES;
import org.example.r05.InternetChip;
import org.junit.jupiter.api.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class CameraTestNew {

    private Camera camera;
    @BeforeEach
    public void setup(){
        camera = new Camera.Builder(new MemoryCardHash(new AES()), new InternetChip()).build();
    }


    @Test
    @Order(1)
    public void testHasFourCores(){
        assertEquals(4, camera.getChip().coreAmount());
    }

    @Test
    @Order(2)
    public void testSpeech(){
        assertEquals("Einfach irgendwas", camera.speechControl());
    }

    @Test
    @Order(3)
    public void testMemoryCardHash(){
        assertTrue(camera.getMemoryCard() instanceof MemoryCardHash);
    }

    @Test
    @Order(4)
    public void testSpeicherungCloud(){
        assertTrue(camera.saveToCloud());
    }

    @TestFactory
    public Iterable<DynamicTest> testFileConversion() {
        String[] inputFiles = {
                "16210486743255",
                "23284533281082",
                "4+fcafeccaca+3",
                "7+fecaeafaaf+6",
                "8+afcfaeeefa+7",
                "7+ccafefccff+8",
                "8+aaffccaeae+2",
                "1+caeaffffcf+3",
                "1+ecefacccea+2",
                "2+aecefafcec+5",
                "1+ccaefacaff+6",
                "2+affcfcecef+2",
                "45711439659503",
                "50023684560054",
                "56037291010905",
                "67962057353456",
                "18412503684671",
                "12668489532959",
                "11007983105935",
                "62683790481713",
                "19714576196122"
        };

        return () -> {
            for (int i = 0; i < inputFiles.length; i++) {
                final String inputFile = inputFiles[i];
                final char[][] expectedArray = TestUtil.convertToCharArray(inputFile);

                DynamicTest dynamicTest = DynamicTest.dynamicTest("Test case " + i, () -> {
                    char[][] resultArray = TestUtil.convertToCharArray(inputFile);
                    assertArrayEquals(expectedArray, resultArray);
                });

                yield dynamicTest;
            }
        };
    }




}
