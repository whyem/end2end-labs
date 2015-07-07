package cl.whyem.app.backend.base;

import org.apache.commons.lang3.ObjectUtils;

/**
 * Clase base para las entidades de la aplicacion. Define el atributo "id" como
 * llave de la entidad e implementa equals/hashCode para que sea consistente con
 * la llave primaria a nivel de base de datos.
 */
public abstract class EntityBase extends BaseBean {

    private static final long serialVersionUID = 2202015144287538980L;

    /**
     * Obtiene el id unico del objeto
     *
     * @return id del objeto
     */
    public abstract Long getId();

    /**
     * Permite setear el id unico del objeto
     *
     * @param id id del objeto
     */
    public abstract void setId(Long id);

    @Override
    public int hashCode() {
        int result = 0;
        if (this.getId() != null) {
            result = this.getId().hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o != null && getClass().isAssignableFrom(o.getClass())) {
            EntityBase entity = (EntityBase) o;
            result = ObjectUtils.equals(this.getId(), entity.getId());
        }
        return result;
    }
}