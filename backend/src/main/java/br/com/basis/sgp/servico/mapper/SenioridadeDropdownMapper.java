package br.com.basis.sgp.servico.mapper;

import br.com.basis.sgp.dominio.Senioridade;
import br.com.basis.sgp.servico.dto.SelectDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SenioridadeDropdownMapper extends EntityMapper<SelectDTO, Senioridade> {

    @Override
    @Mapping(source = "id", target = "value")
    @Mapping(source = "descricao", target = "label")
    SelectDTO toDto(Senioridade entity);

}
