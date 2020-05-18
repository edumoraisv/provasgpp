package br.com.basis.sgp.servico;

import br.com.basis.sgp.servico.dto.ProvaCadastroDTO;
import br.com.basis.sgp.servico.dto.ProvaListagemDTO;
import br.com.basis.sgp.servico.dto.SelectDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProvaServico {

    public Page<ProvaListagemDTO> listarProvas(Pageable pageable);

    public ProvaCadastroDTO exibirPorID(Long id);

    public ProvaCadastroDTO salvar(ProvaCadastroDTO provaCadastroDTO);

    public List<SelectDTO> autocomplete(String query);

    public void excluir(Long id);

}
