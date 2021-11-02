package examen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CSVDataReader {
    private List<String> medidasCSV;

    public List<String> readMedidasCSV(String uri) throws IOException {
        this.medidasCSV = Files.readAllLines(Path.of(uri));
        this.medidasCSV.forEach(s -> s.split(","));
        return this.medidasCSV;
    }
}
