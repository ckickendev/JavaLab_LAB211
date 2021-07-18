package JavaLabCucManh.Day2.CacheVirtual;

import java.util.Date;

public class FuCached {
    private Object data;
    private Date expiredDate;

    public FuCached(Object data, Date expiredDate) {
        this.data = data;
        this.expiredDate = expiredDate;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
}
