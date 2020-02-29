package pl.sda.rafal.zientara.programowanie2.lesson4.money;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class MoneyPresenterTest {

    private MoneyContract.Presenter presenter;
    private MoneyContract.View view;

    @BeforeEach
    public void setUp() { //mockowanie
        view = Mockito.mock(MoneyContract.View.class);
        presenter = new MoneyPresenter(view);
        presenter.prepareData();
    }


    @Test
    public void initPresenter() {
        presenter.initData();
        Mockito.verify(view).refreshList(any());
    }

    @Test
    public void whenQueryChangedRefreshResults() {

        List<Cost> expected = Arrays.asList(new Cost("test", 1, LocalDate.of(2010, 1, 1)));

        presenter.onWordChange("za");

        Mockito.verify(view, Mockito.times(2))
                .refreshList(expected); // za pierwszym razem initData wywo³uje refreshList

    }

}