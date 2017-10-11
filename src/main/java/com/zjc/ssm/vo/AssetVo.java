package com.zjc.ssm.vo;

public class AssetVo {
	public String rfid;
	public String phynum;
	public String assetnum;
	public String description ;
	public String type;

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public String getPhynum() {
		return phynum;
	}

	public void setPhynum(String phynum) {
		this.phynum = phynum;
	}

	public String getAssetnum() {
		return assetnum;
	}

	public void setAssetnum(String assetnum) {
		this.assetnum = assetnum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AssetVo{" +
				"rfid='" + rfid + '\'' +
				", phynum='" + phynum + '\'' +
				", assetnum='" + assetnum + '\'' +
				", description='" + description + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}
