package ${PACKAGE_NAME};

import me.qinchao.web.domain.${NAME};
import org.springframework.data.jpa.repository.JpaRepository;

#parse("File Header.java")
public interface ${NAME}Repository extends JpaRepository<${NAME}, Long> {

}
