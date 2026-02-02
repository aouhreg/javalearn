package order;

/**
 * 訂單業務接口
 */
public interface OrderService {
    /**
     * 創建單個訂單
     */
    void create();

    /**
     * 查詢單個訂單
     */

    void findOne();

    /**
     * 查詢訂單列表
     */
    void findList();

    /**
     * 取消訂單
     */

    void cancel();

    /**
     * 完成訂單
     */
    void finish();
    /**
     * 支付訂單
     */
    void paid();
}
