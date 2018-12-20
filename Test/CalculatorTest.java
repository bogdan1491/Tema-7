import org.junit.Test;
import ro.homework.metriccalculator.Calculator;
import ro.homework.metriccalculator.Distance;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithSameUnitAndFinalMm() {
        String s = "7mm+7mm";
        assertEquals("14.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithSameUnitAndFinalCm() {
        String s = "10mm+10mm";
        assertEquals("2.0cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithSameUnitAndFinalM() {
        String s = "10mm+10mm";
        assertEquals("0.02m", calculator.compute(s, "m").toString());
    }

    @Test
    public void testWhenComputeSubstractionOfTwoNumbersWithSameUnitAndFinalMm() {
        String s = "10mm-7mm";
        assertEquals("3.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeSubstractionOfTwoNumbersWithSameUnitAndFinalCm() {
        String s = "27mm-7mm";
        assertEquals("2.0cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeSubstractionOfTwoNumbersWithSameUnitAndFinalM() {
        String s = "27mm-7mm";
        assertEquals("0.02m", calculator.compute(s, "m").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithSameUnitAndFinalMm() {
        String s = "10mm+15mm+10mm";
        assertEquals("35.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithSameUnitAndFinalCm() {
        String s = "10mm+15mm+10mm";
        assertEquals("3.5cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithSameUnitAndFinalM() {
        String s = "20mm+15mm+10mm";
        assertEquals("0.045m", calculator.compute(s, "m").toString());
    }
    @Test
    public void testWhenComputeSubstractionOfThreeNumbersWithSameUnitAndFinalMm() {
        String s = "20mm-7mm-7mm";
        assertEquals("6.0mm", calculator.compute(s, "mm").toString());
    }
    @Test
    public void testWhenComputeSubstractionOfThreeNumbersWithSameUnitAndFinalCm() {
        String s = "24mm-7mm-7mm";
        assertEquals("1.0cm", calculator.compute(s, "cm").toString());
    }
    @Test
    public void testWhenComputeSubstractionOfThreeNumbersWithSameUnitAndFinalM() {
        String s = "20mm-7mm-7mm";
        assertEquals("0.006m", calculator.compute(s, "m").toString());
    }

    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithDifferentUnitAndFinalMm() {
        String s = "7mm+7cm";
        assertEquals("77.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithDifferentUnitAndFinalCm() {
        String s = "10m+10mm";
        assertEquals("1001.0cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithDifferentUnitAndFinalM() {
        String s = "10cm+10m";
        assertEquals("10.1m", calculator.compute(s, "m").toString());
    }

    @Test
    public void testWhenComputeSubstractionOfTwoNumbersWithDifferentUnitAndFinalMm() {
        String s = "10m-7mm";
        assertEquals("9993.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeSubstractionOfTwoNumbersWithDifferentUnitAndFinalCm() {
        String s = "27m-7cm";
        assertEquals("2693.0cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeSubstractionOfTwoNumbersWithDifferentUnitAndFinalM() {
        String s = "27cm-7mm";
        assertEquals("0.263m", calculator.compute(s, "m").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithDifferentUnitAndFinalMm() {
        String s = "10m+15cm+10mm";
        assertEquals("10160.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithDifferentUnitAndFinalCm() {
        String s = "10cm+15mm+10mm";
        assertEquals("12.5cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithDifferentUnitAndFinalM() {
        String s = "20mm+15mm+10cm";
        assertEquals("0.135m", calculator.compute(s, "m").toString());
    }
    @Test
    public void testWhenComputeSubstractionOfThreeNumbersWithDifferentUnitAndFinalMm() {
        String s = "10m-7mm-7cm";
        assertEquals("9923.0mm", calculator.compute(s, "mm").toString());
    }
    @Test
    public void testWhenComputeSubstractionOfThreeNumbersWithDifferentUnitAndFinalCm() {
        String s = "10m-7mm-7m";
        assertEquals("299.3cm", calculator.compute(s, "cm").toString());
    }
    @Test
    public void testWhenComputeSubstractionOfThreeNumbersWithDifferentUnitAndFinalM() {
        String s = "10cm-7cm-7mm";
        assertEquals("0.023m", calculator.compute(s, "m").toString());
    }
}
