package builder_pattern.product;

/**
 * @author totoro
 * @date 2021-09-23 10:16
 */
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String custume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCustume() {
        return custume;
    }

    public void setCustume(String custume) {
        this.custume = custume;
    }
}
