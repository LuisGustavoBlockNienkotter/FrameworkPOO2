
package Classes.DTO;


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

    public Produto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getListPrice() {
        return listPrice;
    }

    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Object getBestPrice() {
        return bestPrice;
    }

    public void setBestPrice(Object bestPrice) {
        this.bestPrice = bestPrice;
    }

    public Object getInstallment() {
        return installment;
    }

    public void setInstallment(Object installment) {
        this.installment = installment;
    }

    public float getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(float reviewCount) {
        this.reviewCount = reviewCount;
    }

    public float getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(float reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getBadge() {
        return badge;
    }

    public void setBadge(Object badge) {
        this.badge = badge;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasImmediateDelivery() {
        return hasImmediateDelivery;
    }

    public void setHasImmediateDelivery(boolean hasImmediateDelivery) {
        this.hasImmediateDelivery = hasImmediateDelivery;
    }

    public String getMainSeller() {
        return mainSeller;
    }

    public void setMainSeller(String mainSeller) {
        this.mainSeller = mainSeller;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", title=" + title + ", listPrice=" + listPrice + ", price=" + price + ", bestPrice=" + bestPrice + ", installment=" + installment + ", reviewCount=" + reviewCount + ", reviewScore=" + reviewScore + ", imageUrl=" + imageUrl + ", videoUrl=" + videoUrl + ", url=" + url + ", badge=" + badge + ", brand=" + brand + ", hasImmediateDelivery=" + hasImmediateDelivery + ", mainSeller=" + mainSeller + '}';
    }
    
    

   
    
}
