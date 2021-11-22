package core.basesyntax.service.impl;

import core.basesyntax.service.ServiceReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceReaderImpl implements ServiceReader {
    @Override
    public List<String> readFile(String fromFileName) {
        List<String> fruitData;
        try {
            fruitData = new BufferedReader(new FileReader(fromFileName))
                    .lines()
                    .skip(1)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Can't get data from list" + fromFileName, e);
        }
        return fruitData;
    }
}