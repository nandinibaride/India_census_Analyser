package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVStates {
    public static void main(String[] args) {
        String filePath = C:\\Users\\Admin\\Downloads\\CensusAnalyser(1).zip\\CensusAnalyser\\src\\test\\resourcesStateCensusData.csv";
        CSVStates csvStates = new CSVStates();
    }

    /**
     * Purpose : To get the number of records in CSV File
     */
    public int getNumberOfRecords(String filePath) throws CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        int count = fileReaderWriter.getTotalRecords(filePath);

        return count;
    }

    /**
     * Purpose : To get flag  value from FileReader method
     */
    public boolean delimiterChecker(String filePath) {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        boolean flag = fileReaderWriter.checkDelimiter(filePath);
        return flag;
    }

    /**
     * Purpose : To get flag value from FileReaderWriter Method
     */
    public  boolean csvHeaderChecker(String filePath) throws IOException, CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();

        // To compare actual CSV Headers with the headers in list
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("SrNo","State","Name","TIN","code"));
        boolean flag = fileReaderWriter.checkCSVHeader(filePath, stringArrayList);
        return flag;
    }

}

