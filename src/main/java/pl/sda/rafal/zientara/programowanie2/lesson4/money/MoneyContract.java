package pl.sda.rafal.zientara.programowanie2.lesson4.money;

import java.time.LocalDate;
import java.util.List;

public class MoneyContract {

    public interface View {
        void refreshList(List<Cost> data);
    }

    public interface Presenter {
        void prepareData();
        void initData();
        void onWordChange(String word);

        void onPriceFromChange(double fromPrice);
        void onPriceToChange(double toPrice);

        List<Cost> getLastResult();

        void onFromDateChange(LocalDate fromDate);

        void onToDateChange(LocalDate toDate);
    }

}
