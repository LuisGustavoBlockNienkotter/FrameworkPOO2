
package Classes.DTO;

/**
 *
 * @author Luis Gustavo Block Nienkotter
 */
public class Produto {
    private String id;
    private String title;
    private float listPrice;
    private float price;
    private Object bestPrice;
    private Object installment;
    private float reviewCount;
    private float reviewScore;
    private String imageUrl;
    private String videoUrl;
    private String url;
    private Object badge;
    private String brand;
    private boolean hasImmediateDelivery;
    private String mainSeller;

    /**
     *
     */
    public Produto() {
    }

    /**
     *
     * @param id
     * @param title
     * @param listPrice
     * @param price
     * @param bestPrice
     * @param installment
     * @param reviewCount
     * @param reviewScore
     * @param imageUrl
     * @param videoUrl
     * @param url
     * @param badge
     * @param brand
     * @param hasImmediateDelivery
     * @param mainSeller
     */
    public Produto(String id, String title, float listPrice, float price, Object bestPrice, Object installment, float reviewCount, float reviewScore, String imageUrl, String videoUrl, String url, Object badge, String brand, boolean hasImmediateDelivery, String mainSeller) {
        this.id = id;
        this.title = title;
        this.listPrice = listPrice;
        this.price = price;
        this.bestPrice = bestPrice;
        this.installment = installment;
        this.reviewCount = reviewCount;
        this.reviewScore = reviewScore;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.url = url;
        this.badge = badge;
        this.brand = brand;
        this.hasImmediateDelivery = hasImmediateDelivery;
        this.mainSeller = mainSeller;
    }
    

    /**
     *
     * @return 
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return 
     */
    public float getListPrice() {
        return listPrice;
    }

    /**
     *
     * @param listPrice
     */
    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    /**
     *
     * @return
     */
    public float getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public Object getBestPrice() {
        return bestPrice;
    }

    /**
     *
     * @param bestPrice
     */
    public void setBestPrice(Object bestPrice) {
        this.bestPrice = bestPrice;
    }

    /**
     *
     * @return
     */
    public Object getInstallment() {
        return installment;
    }

    /**
     *
     * @param installment
     */
    public void setInstallment(Object installment) {
        this.installment = installment;
    }

    /**
     *
     * @return
     */
    public float getReviewCount() {
        return reviewCount;
    }

    /**
     *
     * @param reviewCount
     */
    public void setReviewCount(float reviewCount) {
        this.reviewCount = reviewCount;
    }

    /**
     *
     * @return
     */
    public float getReviewScore() {
        return reviewScore;
    }

    /**
     *
     * @param reviewScore
     */
    public void setReviewScore(float reviewScore) {
        this.reviewScore = reviewScore;
    }

    /**
     *
     * @return
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     *
     * @param videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     */
    public Object getBadge() {
        return badge;
    }

    /**
     *
     * @param badge
     */
    public void setBadge(Object badge) {
        this.badge = badge;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return
     */
    public boolean isHasImmediateDelivery() {
        return hasImmediateDelivery;
    }

    /**
     *
     * @param hasImmediateDelivery
     */
    public void setHasImmediateDelivery(boolean hasImmediateDelivery) {
        this.hasImmediateDelivery = hasImmediateDelivery;
    }

    /**
     *
     * @return
     */
    public String getMainSeller() {
        return mainSeller;
    }

    /**
     *
     * @param mainSeller
     */
    public void setMainSeller(String mainSeller) {
        this.mainSeller = mainSeller;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", title=" + title + ", listPrice=" + listPrice + ", price=" + price + ", bestPrice=" + bestPrice + ", installment=" + installment + ", reviewCount=" + reviewCount + ", reviewScore=" + reviewScore + ", imageUrl=" + imageUrl + ", videoUrl=" + videoUrl + ", url=" + url + ", badge=" + badge + ", brand=" + brand + ", hasImmediateDelivery=" + hasImmediateDelivery + ", mainSeller=" + mainSeller + '}';
    }
    
    

   
    
}
