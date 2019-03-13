package more_qualiferis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static more_qualiferis.DBType.HDFS;
import static more_qualiferis.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @CadsDao(HDFS)
    private Dao dao;
    @CadsDao(ORACLE)
    private Dao backupDao;

    @Scheduled(fixedDelay =1500)
    public void doBackup() {
        backupDao.save();
    }

    @Scheduled(fixedDelay = 500)
    public void doWork() {
        dao.save();
    }
}
