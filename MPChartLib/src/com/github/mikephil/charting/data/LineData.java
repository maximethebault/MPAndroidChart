
package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Data object that encapsulates all data associated with a LineChart.
 *
 * @author Philipp Jahoda
 */
public class LineData<T extends LineDataSet> extends BarLineScatterCandleData<T> {

    public LineData() {
        super();
    }

    public LineData(List<String> xVals) {
        super(xVals);
    }

    public LineData(String[] xVals) {
        super(xVals);
    }

    public LineData(List<String> xVals, List<T> dataSets) {
        super(xVals, dataSets);
    }

    public LineData(String[] xVals, List<T> dataSets) {
        super(xVals, dataSets);
    }

    public LineData(List<String> xVals, T dataSet) {
        super(xVals, toList(dataSet));
    }

    public LineData(String[] xVals, T dataSet) {
        super(xVals, toList(dataSet));
    }

    private static <T extends LineDataSet> List<T> toList(T dataSet) {
        List<T> sets = new ArrayList<T>();
        sets.add(dataSet);
        return sets;
    }
}
