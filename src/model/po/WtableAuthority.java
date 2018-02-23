package model.po;

public class WtableAuthority {
    private Integer id;

    private String name;

    private String beiZhu;

    private String mtmask;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBeiZhu() {
        return beiZhu;
    }

    public void setBeiZhu(String beiZhu) {
        this.beiZhu = beiZhu == null ? null : beiZhu.trim();
    }

    public String getMtmask() {
        return mtmask;
    }

    public void setMtmask(String mtmask) {
        this.mtmask = mtmask == null ? null : mtmask.trim();
    }

	@Override
	public String toString() {
		return "WtableAuthority [id=" + id + ", name=" + name + ", beiZhu="
				+ beiZhu + ", mtmask=" + mtmask + "]";
	}

    
}