package more_qualiferis;

import org.springframework.stereotype.Repository;

import static more_qualiferis.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@CadsDao(ORACLE)
public class BackupDao implements Dao {

    @Override
    public void save() {
        System.out.println("saving to ORACLE");
    }
}
