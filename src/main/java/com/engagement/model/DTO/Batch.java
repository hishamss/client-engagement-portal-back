package com.engagement.model.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Batch {
    private String batchId;
    private String name;
    private String startDate;
    private String endDate;
    private String skill;
    private String location;
    private String type;
    private int goodGrade;
    private int passingGrade;
    private int currentWeek;
    private EmployeeAssignment employeeAssignments[];
    private AssociateAssignment associateAssignments[];
}