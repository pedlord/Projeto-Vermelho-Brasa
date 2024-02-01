package vermelho_brasa.service;

import org.springframework.data.domain.Page;

public interface ICamaradaServidor {
    public <T,C> Page<T> save(C classe, Class<T> type);

    public <T,C> Page<T> update(C classe, Class<T> type);
}
