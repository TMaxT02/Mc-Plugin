import com.demo.hibernate.entity.PlayerEntity
import net.projecttl.plugin.example.utility.HibernateUtil
import org.hibernate.*


/**#################################################################
 * @author ANICET ERIC KOUAME
 * @Date: 20 mars 2017
 * @Description:
 * BookDao
 * #################################################################
 */
class PlayerManager (){
    fun getPlayer(): PlayerEntity {
        val session: Session = HibernateUtil.session
        val query = session.createQuery("from Book")
        query.maxResults = 1
        val players: List<PlayerEntity> = query.list() as List<PlayerEntity>
        val player: PlayerEntity? = players.firstOrNull()
        session.close()
        return player!!
    }
}