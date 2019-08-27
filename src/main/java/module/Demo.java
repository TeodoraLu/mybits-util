package module;

import java.io.Serializable;

/**
 * @ClassName FundSource
 * @Description 资金来源信息
 * @Author menghy
 * @Date 2019/7/26 15:09
 * @Version 1.0
 */
public class Demo implements Serializable {

    private static final long serialVersionUID = -1962442201815267801L;

    /**
     * 资金来源ID
     */
    private Integer id;

    /**
     * 资金来源编码
     */
    private String code;
    /**
     * 资金来源名称
     */
    private String name;

    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * <p>You can use getId() to get the value of id</p >
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the value of code.
     *
     * @return the value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * <p>You can use getCode() to get the value of code</p >
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * <p>You can use getName() to get the value of name</p >
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
}
