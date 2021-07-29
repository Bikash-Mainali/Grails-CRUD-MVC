package com.djamware

class EmployeeController {

    EmployeeService employeeService

    def index() {
        redirect action: "welcome", method: "GET"
    }

    def welcome() {}
/*
    def getAllEmployee() {
        def empDetailsList = employeeService.list();
        for (Employee employee : empDetailsList) {
            println(".............." + employee.getFirstName())
        }
        respond employeeService.list();

    }

    def show(Long id) {
        respond employeeService.get(id)
    }

*//*
    def addEmployee() {
        println("..................adding student..............");
        println(params)
        respond new Employee(params)
    }
*//*

    def save(Employee employee) {
        employeeService.save(employee)
        redirect action: "getAllEmployee", method: "GET"
    }

    def delete(Long id) {
        employeeService.delete(id)
        redirect action: "getAllEmployee", method: "GET"
    }

    def updateEmployee(Long id) {
        println("update........." + params.name);
    }*/

}