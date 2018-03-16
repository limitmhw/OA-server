package model.po;

public class WtableTitle {
    private Integer id;

    private Integer tableId;

    private Integer trOrder;

    private String title;

    private String level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getTrOrder() {
        return trOrder;
    }

    public void setTrOrder(Integer trOrder) {
        this.trOrder = trOrder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }
}