package cl.whyem.app.backend.base;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Clase base de entidades con ID autoincrementable.
 */
@MappedSuperclass
public abstract class AutoIncrementEntityBase extends EntityBase {

    private static final long serialVersionUID = 2202015144287538980L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dynamicIdGenerator")
    @GenericGenerator(
            name = "dynamicIdGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "prefer_sequence_per_entity", value = "true"),
                    @Parameter(name = "sequence_per_entity_suffix", value = "_id_seq"),
                    @Parameter(name = "initial_value", value = "1000"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id = null;

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