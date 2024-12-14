package pe.edu.cibertec.DAWI_CL3_MontoyaFlores_MarceloRodrigo.response;

import pe.edu.cibertec.DAWI_CL3_MontoyaFlores_MarceloRodrigo.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {
}
