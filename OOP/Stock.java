package OOP;
import model.StockMap;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Stock {
    protected StockMap stockData;

    StockMap stockMap = new StockMap();
    /**
     * Method for reading the Json file and convert to java object using Jackson ObjectMapper
     */
    protected void readJsonFile() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // JSON file to Java object
            stockData = mapper.readValue(new File("E:\\BridgeLabs Training\\Java\\OOPs Program\\StockAccountManagement\\StockData.json"), StockMap.class );
            System.out.println("Data From JSON File : " + stockData.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for calculating share value for stock
     */
    protected void calculateValue() {

        for (int i = 0; i < stockData.getWiproList().size(); i++) {
            stockData.getWiproList().get(i).setTotalValue(stockData.getWiproList().get(i).getNoOfShare() * stockData.getWiproList().get(i).getSharePrice());
            stockData.getBajajList().get(i).setTotalValue(stockData.getBajajList().get(i).getNoOfShare() * stockData.getBajajList().get(i).getSharePrice());
        }
    }

    /**
     * Method for converting the java object to Json string and writing into a json file using Jackson ObjectMapper
     */
    protected void writeToJsonFile() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(Paths.get("CalculatedStockData.json").toFile(), stockData);
            String jsonString = mapper.writeValueAsString(stockData);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}