package cl.whyem.app.backend.base;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Clase base para las entidades de la aplicacion. Define el atributo "id" como
 * llave de la entidad e implementa equals/hashCode para que sea consistente con
 * la llave primaria a nivel de base de datos.
 */
@MappedSuperclass
public abstract class PersistentEntityBase extends EntityBase {

    private static final long serialVersionUID = 2202015144287538980L;
    @Id
    @Column(name = "id")
    private Long id = 0L;

    /**
     * Obtiene el id unico del objeto
     *
     * @return id del objeto
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * Permite setear el id unico del objeto
     *
     * @param id id del objeto
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

}