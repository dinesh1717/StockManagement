package OOP;
import java.util.List;

public class StockMap {
    private List<Wipro> wiproList;
    private List<Bajaj> bajajList;


    public List<Wipro> getWiproList() {
        return wiproList;
    }

    public void setWiproList(List<Wipro> wiproList) {
        this.wiproList = wiproList;
    }

    public List<Bajaj> getBajajList() {
        return bajajList;
    }

    public void setBajajList(List<Bajaj> bajajList) {
        this.bajajList = bajajList;
    }

    @Override
    public String toString() {
        return "StockMap{" +
                "wiproList=" + wiproList +
                ", bajajList=" + bajajList +
                '}';
    }
}

