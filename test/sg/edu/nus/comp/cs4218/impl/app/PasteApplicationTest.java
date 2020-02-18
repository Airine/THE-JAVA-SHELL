package sg.edu.nus.comp.cs4218.impl.app;

import org.junit.jupiter.api.Test;
import sg.edu.nus.comp.cs4218.app.PasteInterface;
import sg.edu.nus.comp.cs4218.exception.PasteException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.*;
import static sg.edu.nus.comp.cs4218.impl.util.ErrorConstants.ERR_NO_ISTREAM;
import static sg.edu.nus.comp.cs4218.impl.util.ErrorConstants.ERR_NO_OSTREAM;
import static sg.edu.nus.comp.cs4218.impl.util.ErrorConstants.ERR_NULL_ARGS;
import static sg.edu.nus.comp.cs4218.impl.util.StringUtils.CHAR_TAB;
import static sg.edu.nus.comp.cs4218.impl.util.StringUtils.STRING_NEWLINE;

class PasteApplicationTest {

    private final PasteInterface app = new PasteApplication();
    private OutputStream outputStream = null;
    private static String fileNameA = "asset/A.txt";
    private static String fileNameB = "asset/B.txt";
    private static String fileNameC = "asset/C.txt";
    private static String fileNameEmpty1 = "asset/empty1.txt";
    private static String fileNameEmpty2 = "asset/empty2.txt";

    @Test
    void testMergeStdin() throws Exception {
        String original = "1"+STRING_NEWLINE+"2"+STRING_NEWLINE+"3"+STRING_NEWLINE+"4"+STRING_NEWLINE;
        InputStream stdin = new ByteArrayInputStream(original.getBytes());
        String expectResult = "1"+STRING_NEWLINE+"2"+STRING_NEWLINE+"3"+STRING_NEWLINE+"4"+STRING_NEWLINE;
        String realResult = app.mergeStdin(stdin);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testMergeTwoEmptyFiles() throws Exception {
        String expectResult = "";
        String realResult = app.mergeFile(fileNameEmpty1, fileNameEmpty2);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testMergeEmptyFileWithNonEmptyFile() throws Exception {
        String expectResult = CHAR_TAB+"A"+CHAR_TAB+STRING_NEWLINE+
                CHAR_TAB+"B"+CHAR_TAB+STRING_NEWLINE+
                CHAR_TAB+"C"+CHAR_TAB+STRING_NEWLINE+
                CHAR_TAB+"D"+CHAR_TAB+STRING_NEWLINE;
        String realResult = app.mergeFile(fileNameEmpty1, fileNameA);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testMergeNonEmptyFileWithEmptyFile() throws Exception {
        String expectResult = "A"+CHAR_TAB+CHAR_TAB+STRING_NEWLINE+
                "B"+CHAR_TAB+CHAR_TAB+STRING_NEWLINE+
                "C"+CHAR_TAB+CHAR_TAB+STRING_NEWLINE+
                "D"+CHAR_TAB+CHAR_TAB+STRING_NEWLINE;
        String realResult = app.mergeFile(fileNameA, fileNameEmpty2);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testMergeOneFile() throws Exception {
        String expectResult = "A"+STRING_NEWLINE+"B"+STRING_NEWLINE+"C"+STRING_NEWLINE+"D"+STRING_NEWLINE;
        String realResult = app.mergeFile(fileNameA);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testMergeTwoFilesWithSameLineNumber() throws Exception {
        String expectResult = "A"+CHAR_TAB+"1"+CHAR_TAB+STRING_NEWLINE+
                "B"+CHAR_TAB+"2"+CHAR_TAB+STRING_NEWLINE+
                "C"+CHAR_TAB+"3"+CHAR_TAB+STRING_NEWLINE+
                "D"+CHAR_TAB+"4"+CHAR_TAB+STRING_NEWLINE;
        String realResult = app.mergeFile(fileNameA, fileNameB);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testMergeTwoFilesWithDifferentLineNumber() throws Exception {
        String expectResult = "A"+CHAR_TAB+"1"+CHAR_TAB+STRING_NEWLINE+
                "B"+CHAR_TAB+"3"+CHAR_TAB+STRING_NEWLINE+
                "C"+CHAR_TAB+"5"+CHAR_TAB+STRING_NEWLINE+
                "D"+CHAR_TAB+"7"+CHAR_TAB+STRING_NEWLINE+
                CHAR_TAB+"9"+CHAR_TAB+STRING_NEWLINE;
        String realResult = app.mergeFile(fileNameA, fileNameC);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testMergeThreeFilesWithDifferentLineNumber() throws Exception {
        String expectResult = "A"+CHAR_TAB+"1"+CHAR_TAB+"1"+CHAR_TAB+STRING_NEWLINE+
                "B"+CHAR_TAB+"2"+CHAR_TAB+"3"+CHAR_TAB+STRING_NEWLINE+
                "C"+CHAR_TAB+"3"+CHAR_TAB+"5"+CHAR_TAB+STRING_NEWLINE+
                "D"+CHAR_TAB+"4"+CHAR_TAB+"7"+CHAR_TAB+STRING_NEWLINE+
                CHAR_TAB+CHAR_TAB+"9"+CHAR_TAB+STRING_NEWLINE;
        String realResult = app.mergeFile(fileNameA, fileNameB, fileNameC);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testMergeStdinWithFiles() throws Exception {
        String original = "A"+STRING_NEWLINE+"B"+STRING_NEWLINE+"C"+STRING_NEWLINE+"D"+STRING_NEWLINE;
        InputStream stdin = new ByteArrayInputStream(original.getBytes());
        String expectResult = "A"+CHAR_TAB+"1"+CHAR_TAB+"1"+CHAR_TAB+STRING_NEWLINE+
                "B"+CHAR_TAB+"2"+CHAR_TAB+"3"+CHAR_TAB+STRING_NEWLINE+
                "C"+CHAR_TAB+"3"+CHAR_TAB+"5"+CHAR_TAB+STRING_NEWLINE+
                "D"+CHAR_TAB+"4"+CHAR_TAB+"7"+CHAR_TAB+STRING_NEWLINE+
                CHAR_TAB+CHAR_TAB+"9"+CHAR_TAB+STRING_NEWLINE;
        String realResult = app.mergeFileAndStdin(stdin, fileNameB, fileNameC);
        assertEquals(expectResult, realResult);
    }

    @Test
    void testRunWithOnlyStdin() throws Exception {
        String[] args = {"-"};
        String original = "1"+STRING_NEWLINE+"2"+STRING_NEWLINE+"3"+STRING_NEWLINE+"4"+STRING_NEWLINE;
        InputStream stdin = new ByteArrayInputStream(original.getBytes());
        String expectResult = "1"+STRING_NEWLINE+"2"+STRING_NEWLINE+"3"+STRING_NEWLINE+"4"+STRING_NEWLINE;
        outputStream = new ByteArrayOutputStream();
        app.run(args, stdin, outputStream);
        assertEquals(expectResult, outputStream.toString());
    }

    @Test
    void testRunWithOnlyFiles() throws Exception {
        String[] args = {fileNameA, fileNameB};
        String expectResult = "A"+CHAR_TAB+"1"+CHAR_TAB+STRING_NEWLINE+
                "B"+CHAR_TAB+"2"+CHAR_TAB+STRING_NEWLINE+
                "C"+CHAR_TAB+"3"+CHAR_TAB+STRING_NEWLINE+
                "D"+CHAR_TAB+"4"+CHAR_TAB+STRING_NEWLINE;
        outputStream = new ByteArrayOutputStream();
        app.run(args, System.in, outputStream);
        assertEquals(expectResult, outputStream.toString());
    }

    @Test
    void testRunWitStdinAndFiles() throws Exception {
        String[] args = {"-", fileNameB, fileNameC};
        String original = "A"+STRING_NEWLINE+"B"+STRING_NEWLINE+"C"+STRING_NEWLINE+"D"+STRING_NEWLINE;
        InputStream stdin = new ByteArrayInputStream(original.getBytes());
        String expectResult = "A"+CHAR_TAB+"1"+CHAR_TAB+"1"+CHAR_TAB+STRING_NEWLINE+
                "B"+CHAR_TAB+"2"+CHAR_TAB+"3"+CHAR_TAB+STRING_NEWLINE+
                "C"+CHAR_TAB+"3"+CHAR_TAB+"5"+CHAR_TAB+STRING_NEWLINE+
                "D"+CHAR_TAB+"4"+CHAR_TAB+"7"+CHAR_TAB+STRING_NEWLINE+
                CHAR_TAB+CHAR_TAB+"9"+CHAR_TAB+STRING_NEWLINE;
        outputStream = new ByteArrayOutputStream();
        app.run(args, stdin, outputStream);
        assertEquals(expectResult, outputStream.toString());
    }

    @Test
    void testRunWithNullArgs() {
        outputStream = new ByteArrayOutputStream();
        Throwable thrown = assertThrows(PasteException.class, () -> {
            app.run(null, System.in, outputStream);
        });
        assertEquals(thrown.getMessage(), "paste: " + ERR_NULL_ARGS);
    }

    @Test
    void testRunWithNullOStream() {
        String[] args = {"a","b"};
        Throwable thrown = assertThrows(PasteException.class, () -> {
            app.run(args, System.in, outputStream);
        });
        assertEquals(thrown.getMessage(), "paste: " + ERR_NO_OSTREAM);
    }

    @Test
    void testRunWithNullIStream() {
        String[] args = {"-","b"};
        outputStream = new ByteArrayOutputStream();
        Throwable thrown = assertThrows(PasteException.class, () -> {
            app.run(args, null, outputStream);
        });
        assertEquals(thrown.getMessage(), "paste: " + ERR_NO_ISTREAM);
    }

}