package cl.whyem.app.backend.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Clase base para todos los bean's de la aplicacion. Implementa serializable
 * e implementa el metodo toString() de forma conveniente para mejor logeo y
 * visualizacion de los objetos en tiempo de debug.
 */
public class BaseBean implements Serializable {

    private static final long serialVersionUID = -5747159829033690039L;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(
                this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}