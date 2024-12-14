package pe.edu.cibertec.DAWI_CL3_MontoyaFlores_MarceloRodrigo.response;

import pe.edu.cibertec.DAWI_CL3_MontoyaFlores_MarceloRodrigo.dto.CarDetailDto;

public record FindCarsByIdResponse(String code,
                                   String error,
                                   CarDetailDto cars) {
}
