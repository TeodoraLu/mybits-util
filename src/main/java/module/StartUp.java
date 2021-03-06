package module;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class StartUp {
    /**
     * 根据数据库生成mapper
     * @param args
     * @throws URISyntaxException
     */
	public static void main(String[] args) throws URISyntaxException {
        try {
        	
            List<String> warnings = new ArrayList<String>();
    		boolean overwrite = true;
    		File configFile = new File("generatorConfig.xml");
    	    ConfigurationParser cp = new ConfigurationParser(warnings);
    	    Configuration config = cp.parseConfiguration(configFile);
    	    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    	    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    	    myBatisGenerator.generate(null);
            System.out.println("Mybatis Generator 逆向生成Dao完成");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
    }
}
