package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

/**
 * Created by arpan on 05/12/2016.
 */
public class DataProviderFactory {


    public static ConfigDataProvider getConfig() {

        ConfigDataProvider config = new ConfigDataProvider();
        return config;
    }

    public static ExcelDataProvider getExcel() {
        ExcelDataProvider excel = new ExcelDataProvider();
        return excel;
    }









}
