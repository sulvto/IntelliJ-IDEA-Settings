package ${PACKAGE_NAME};

import com.google.common.collect.Lists;
import me.qinchao.web.domain.${NAME};
import me.qinchao.web.exception.${NAME}NotFoundException;
import me.qinchao.web.repository.${NAME}Repository;
import me.qinchao.web.service.${NAME}Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

#parse("File Header.java")
@Service
public class Repository${NAME}Service implements ${NAME}Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Repository${NAME}Service.class);

    private ${NAME}Repository repository;

    @Autowired
    public Repository${NAME}Service(${NAME}Repository repository) {
        this.repository = repository;
    }

    @Override
    public ${NAME} add(${NAME} added) {
        LOGGER.debug("Adding a new model entry with information: {}", added);

        return repository.save(added);
    }

    @Override
    public Iterable<${NAME}> findAll() {
        LOGGER.debug("Finding all model entries");
        return repository.findAll();
    }

    @Override
    public ${NAME} deleteById(Long id) throws ${NAME}NotFoundException {
        LOGGER.debug("Deleting a model entry with id: {}", id);
        ${NAME} deleted = findById(id);
        LOGGER.debug("Deleting model entry: {}", deleted);
        repository.delete(deleted);
        return deleted;
    }

    @Override
    public ${NAME} findById(Long id) throws ${NAME}NotFoundException {
        LOGGER.debug("Finding a model entry with id: {}", id);
        Optional<${NAME}> modelOptional = repository.findById(id);
        if (modelOptional.isPresent()) {
            ${NAME} model = modelOptional.get();
            LOGGER.debug("Found model entry: {}", model);
            return model;
        } else {
            throw new ${NAME}NotFoundException("No model entry found with id: {}" + id);
        }
    }

    @Override
    public ${NAME} update(${NAME} updated) throws ${NAME}NotFoundException {
        LOGGER.debug("Updating contact with information: {}", updated);
        ${NAME} model = findById(updated.getId());
        LOGGER.debug("Updating a model entry: {}", model);
        repository.save(model);

        return model;
    }
}
