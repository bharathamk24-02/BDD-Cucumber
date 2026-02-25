package api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRequest {


//        public String _id;
//        public String empId;
        public String employeeName;
//        public String course;
         public String startDate;
       public String endDate;
    ////        public String status;
    ////        public String trainerName;
    ////        public String trainingType;
    ////        public int percentCompleted;
    public String projectName;
//    public int __v;

//    public String getTrainerName() {
//        return trainerName;
//    }
//
//    public void setTrainerName(String trainerName) {
//        this.trainerName = trainerName;
//    }
//
//    public String get_id() {
//        return _id;
//    }
//
//    public void set_id(String _id) {
//        this._id = _id;
//    }
//
//    public String getEmpId() {
//        return empId;
//    }
//
//    public void setEmpId(String empId) {
//        this.empId = empId;
//    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

//    public String getCourse() {
//        return course;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }
//
//    public Date getStartDate() {
//        return startDate;
//    }
//
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }
//
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

  //  public String getStatus() {
 //       return status;
 //   }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getTrainingType() {
//        return trainingType;
//    }
//
//    public void setTrainingType(String trainingType) {
//        this.trainingType = trainingType;
//    }
//
//    public int getPercentCompleted() {
//        return percentCompleted;
//    }
//
//    public void setPercentCompleted(int percentCompleted) {
//        this.percentCompleted = percentCompleted;
//    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

//    public int get__v() {
//        return __v;
//    }
//
//    public void set__v(int __v) {
//        this.__v = __v;
//    }


    }

