package q1;

import java.util.Date;


public class BaseClass<T> {
    private T id;
    private Date createdDate;
    private Date updatedDate;
    private Date deletedDate;


    public BaseClass(T id) {
        this.id = id;
        this.createdDate = new Date();
        this.updatedDate = new Date();
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }
}
