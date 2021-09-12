package Models;

import java.util.Date;

/**
 * @author Andrew Walsh
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date createDate;
    private String createdBy;
    private Date lastUpdate;
    private String lastUpdatedBy;

    public User(int id, String username, String password, Date createDate, String createdBy, Date lastUpdate, String lastUpdatedBy) {
        this.username = username;
        this.password = password;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * @return user's id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return user's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return date user was created at
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate date to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return name of user's creator
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy name of creator to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return date user was last updated
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate last update date to set
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * @return name of user's last updater
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * @param lastUpdatedBy name of updater to set
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
