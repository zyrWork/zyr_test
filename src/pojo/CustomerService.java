package pojo;

public class CustomerService {
    private Integer customerServiceSerial;

    private String workNo;

    private String customerServiceName;

    private String customerServiceTel;

    public Integer getCustomerServiceSerial() {
        return customerServiceSerial;
    }

    public void setCustomerServiceSerial(Integer customerServiceSerial) {
        this.customerServiceSerial = customerServiceSerial;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo == null ? null : workNo.trim();
    }

    public String getCustomerServiceName() {
        return customerServiceName;
    }

    public void setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName == null ? null : customerServiceName.trim();
    }

    public String getCustomerServiceTel() {
        return customerServiceTel;
    }

    public void setCustomerServiceTel(String customerServiceTel) {
        this.customerServiceTel = customerServiceTel == null ? null : customerServiceTel.trim();
    }
}