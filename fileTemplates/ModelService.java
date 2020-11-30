package ${PACKAGE_NAME};

import me.qinchao.web.domain.${NAME};
import me.qinchao.web.exception.${NAME}NotFoundException;

import java.util.List;

#parse("File Header.java")
public interface ${NAME}Service {

    /**
     * Adds a new model entry.
     *
     * @param added The information of the added model entry.
     * @return The added model entry.
     */
    public ${NAME} add(${NAME} added);

    /**
     * Returns a list of model entries.
     *
     * @return
     */
    public Iterable<${NAME}> findAll();

    /**
     * Deletes a model entry.
     *
     * @param id    The id of the deleted model entry.
     * @return      The deleted model entry.
     * @throws ${NAME}NotFoundException    if no model entry is found with thr given id.
     */
    public ${NAME} deleteById(Long id) throws ${NAME}NotFoundException;

    /**
     * Finds a model entry.
     * @param id    The id of the wanted model entry.
     * @return      The found model entry.
     * @throws ${NAME}NotFoundException    if no model entry is found with thr given id.
     */
    public ${NAME} findById(Long id) throws ${NAME}NotFoundException;

    /**
     * Updates the information of a model entry.
     * @param updated   The information of the updated model entry.
     * @return      The updated model entry.
     * @throws ${NAME}NotFoundException    if no model entry is found with thr given id.
     */
    public ${NAME} update(${NAME} updated) throws ${NAME}NotFoundException;
}
