package entity;

import lombok.Data;
import org.bitcoinj.core.Address;
import org.bitcoinj.script.Script;

/**
 * P2SH多签账号
 */
@Data
public class P2SHMultiSigAccount {
    /**
     * 多签赎回脚本
     */
    protected Script redeemScript;
    /**
     * 和脚本关联的地址对象
     */
    protected Address address;

    public P2SHMultiSigAccount(Script redeemScript, Address address) {
        this.redeemScript = redeemScript;
        this.address = address;
    }
}
