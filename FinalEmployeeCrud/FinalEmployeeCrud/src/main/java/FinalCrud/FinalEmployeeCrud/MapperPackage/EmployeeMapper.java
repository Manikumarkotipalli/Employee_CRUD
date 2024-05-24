package FinalCrud.FinalEmployeeCrud.MapperPackage;



import FinalCrud.FinalEmployeeCrud.DTO.EmployeeDto;
import FinalCrud.FinalEmployeeCrud.Entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        if (employee == null) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setEmail(employee.getEmail());

        return employeeDto;
    }

    // Convert EmployeeDto to Employee entity
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        if (employeeDto == null) {
            return null;
        }

        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());

        return employee;
    }

    // Default method for getting name
    public static String getName(Employee employee) {
        if (employee == null) {
            return null;
        }
        return employee.getFirstName() + " " + employee.getLastName();
    }

    // Default method for setting name
    public static void setName(Employee employee, String name) {
        if (employee == null || name == null || name.trim().isEmpty()) {
            return;
        }
        String[] parts = name.split(" ");
        if (parts.length >= 2) {
            employee.setFirstName(parts[0]);
            employee.setLastName(parts[1]);
        } else if (parts.length == 1) {
            employee.setFirstName(parts[0]);
            employee.setLastName("");
        }
    }


}
