
package pl.sda.hotelweatherproject.response.buisnessaddressresponse;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ResourceSet {

    @SerializedName("estimatedTotal")
    @Expose
    private Integer estimatedTotal;
    @SerializedName("resources")
    @Expose
    private List<Resource> resources = null;

    public Integer getEstimatedTotal() {
        return estimatedTotal;
    }

    public void setEstimatedTotal(Integer estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

}
