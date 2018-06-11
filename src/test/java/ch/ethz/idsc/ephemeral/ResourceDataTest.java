// code by jph
package ch.ethz.idsc.ephemeral;

import java.util.Arrays;
import java.util.List;

import ch.ethz.idsc.tensor.Tensor;
import ch.ethz.idsc.tensor.alg.Dimensions;
import ch.ethz.idsc.tensor.io.ResourceData;
import junit.framework.TestCase;

public class ResourceDataTest extends TestCase {
  public void testSimple() {
    Tensor tensor = ResourceData.of("/dubilab/controlpoints/ducttape/20180514.csv");
    List<Integer> size = Dimensions.of(tensor);
    assertEquals(size, Arrays.asList(12, 3));
  }
}
