package com.mjl.mycloud.dto;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Miaojiale on 5/6/2019.
 */
@Component
public class MPRReporting  {
    public static final String TABLE_NAME = "mpr_reporting";
    public static final String COL_GUID = "mpr_reporting_id";
    public static final String COL_MPR_REGISTRATION_DETAIL_ID = "mpr_registration_detail_id";
    public static final String COL_PACKAGING_DATA = "packaging_data";
    public static final String COL_METHODOLOGY_DOC = "methodology_doc";
    public static final String COL_BRAND_NAME_LIST = "brand_name_list";
    public static final String COL_APP_NO = "app_no";
    public static final String COL_APP_STATUS = "app_status";
    public static final String COL_SUBMISSION_TIME = "submission_time";
    public static final String COL_SUBMITTED_BY = "submitted_by";
    public static final String COL_SUBMISSION_YEAR = "submission_year";
    public static final String COL_ERROR_MSG_FILE_ID = "error_msg_file_id";

    private String mpr_reporting_id;
    private String mpr_registration_detail_id;
    private String packaging_data;
    private String methodology_doc;
    private String brand_name_list;
    private String app_no;
    private String app_status;
    private String submitted_by;
    private Date submission_time;
    private Integer submission_year;
    private String error_msg_file_id;

    public String getMpr_reporting_id() {
        return mpr_reporting_id;
    }

    public void setMpr_reporting_id(String mpr_reporting_id) {
        this.mpr_reporting_id = mpr_reporting_id;
    }

    public String getMpr_registration_detail_id() {
        return mpr_registration_detail_id;
    }

    public void setMpr_registration_detail_id(String mpr_registration_detail_id) {
        this.mpr_registration_detail_id = mpr_registration_detail_id;
    }

    public String getPackaging_data() {
        return packaging_data;
    }

    public void setPackaging_data(String packaging_data) {
        this.packaging_data = packaging_data;
    }

    public String getMethodology_doc() {
        return methodology_doc;
    }

    public void setMethodology_doc(String methodology_doc) {
        this.methodology_doc = methodology_doc;
    }

    public String getBrand_name_list() {
        return brand_name_list;
    }

    public void setBrand_name_list(String brand_name_list) {
        this.brand_name_list = brand_name_list;
    }

    public String getApp_no() {
        return app_no;
    }

    public void setApp_no(String app_no) {
        this.app_no = app_no;
    }

    public String getApp_status() {
        return app_status;
    }

    public void setApp_status(String app_status) {
        this.app_status = app_status;
    }

    public String getSubmitted_by() {
        return submitted_by;
    }

    public void setSubmitted_by(String submitted_by) {
        this.submitted_by = submitted_by;
    }

    public Date getSubmission_time() {
        return submission_time;
    }

    public void setSubmission_time(Date submission_time) {
        this.submission_time = submission_time;
    }

    public Integer getSubmission_year() {
        return submission_year;
    }

    public void setSubmission_year(Integer submission_year) {
        this.submission_year = submission_year;
    }

    public String getError_msg_file_id() {
        return error_msg_file_id;
    }

    public void setError_msg_file_id(String error_msg_file_id) {
        this.error_msg_file_id = error_msg_file_id;
    }

    @Override
    public String toString() {
        return "MPRReporting{" +
                "mpr_reporting_id='" + mpr_reporting_id + '\'' +
                ", mpr_registration_detail_id='" + mpr_registration_detail_id + '\'' +
                ", packaging_data='" + packaging_data + '\'' +
                ", methodology_doc='" + methodology_doc + '\'' +
                ", brand_name_list='" + brand_name_list + '\'' +
                ", app_no='" + app_no + '\'' +
                ", app_status='" + app_status + '\'' +
                ", submitted_by='" + submitted_by + '\'' +
                ", submission_time=" + submission_time +
                ", submission_year=" + submission_year +
                ", error_msg_file_id='" + error_msg_file_id + '\'' +
                '}';
    }
}
