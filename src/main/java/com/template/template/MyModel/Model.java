package com.template.template.MyModel;

import com.sun.org.apache.bcel.internal.generic.FLOAD;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name="STUDENT")

public class Model {

    @Id
    @GeneratedValue
    private int id;
    private String student;
    private float marks;

}
