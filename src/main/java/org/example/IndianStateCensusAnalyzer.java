package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/*
*Purpose : Ability for the analyser to load the Indian States Census
*authour : Nandini.B
*/
public class IndianStateCensusAnalyzer
{
    public static void main(String[] args) throws CustomizedExceptions
    {
        String filePath = "C:\\Users\\Admin\\Downloads\\CensusAnalyser (1) (1).zip\\CensusAnalyser\\src\\test\\resourcesStateCensusData.csv";
        IndianStateCensusAnalyzer id = new IndianStateCensusAnalyzer();
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
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("State","Population","Area","Density"));
        boolean flag = fileReaderWriter.checkCSVHeader(filePath, stringArrayList);
        return flag;
    }
}

