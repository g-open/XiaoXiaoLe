package cn.g_open.xiaoxiaole.common.dto;

import java.util.Date;

import cn.g_open.xiaoxiaole.common.utils.ConstUtil;


public class BaseDTO
{
    private int dataStatus;
    
    private String createBy;
    
    private Date createDate;
    
    private String updateBy;
    
    private Date updateDate;


    public BaseDTO(){
    	this.dataStatus = 1;
    	this.createBy = ConstUtil.sysName;
    	this.createDate = new Date();
    	this.updateBy = ConstUtil.sysName;
    	this.updateDate = new Date();
    }
    
    public int getDataStatus()
    {
        return dataStatus;
    }

    public void setDataStatus(int dataStatus)
    {
        this.dataStatus = dataStatus;
    }

    public String getCreateBy()
    {
        return createBy;
    }

    public void setCreateBy(String createBy)
    {
        this.createBy = createBy;
    }

    public Date getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public String getUpdateBy()
    {
        return updateBy;
    }

    public void setUpdateBy(String updateBy)
    {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate()
    {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate)
    {
        this.updateDate = updateDate;
    }
    
}
