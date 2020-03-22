/*
 *
 *     WSKCipher
 *     A tool to encrypt and decrypt text.
 *     Copyright (c) 2020 wsk
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 *     Contact me : Wechat: vic20070927 Phone: 18514463331
 *
 *     WSKCipher
 *     加解密工具
 *     版权所有（C）2020 wsk
 *     本程序为自由软件，在自由软件联盟发布的GNU通用公共许可协议的约束下，你可以对其进行再发布及修改。协议版本为第三版或（随你）更新的版本。
 *     我们希望发布的这款程序有用，但不保证，甚至不保证它有经济价值和适合特定用途。详情参见GNU通用公共许可协议。
 *     你理当已收到一份GNU通用公共许可协议的副本，如果没有，请查阅<http://www.gnu.org/licenses/>
 *
 *     联系方式： 微信：vic20070927 电话：18514463331
 */

package org.wsk.cipher;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

public class CipherHelper {
    private SecretKeys keys;

    public SecretKeys getKeys() {
        return keys;
    }

    public void setKeys(SecretKeys keys) {
        this.keys = keys;
    }

    public String RSA_encrypt_public(String str) throws Exception {
        return ParseSystemUtil.parseByte2HexStr(RSAUtil.encryptByPublicKey(str.getBytes("utf-8") , keys.getRSA_Public_Key()));
    }

    public String RSA_decrypt_private(String str) throws Exception {
        return new String(RSAUtil.decryptByPrivateKey(ParseSystemUtil.parseHexStr2Byte(str) , keys.getRSA_Private_Key()));
    }

    public String AES_encrypt(String str) throws UnsupportedEncodingException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
        return ParseSystemUtil.parseByte2HexStr(AESUtil.encryptAES(str.getBytes("utf-8") , AESUtil.strKey2SecretKey(keys.getAES_Key())));
    }

    public String AES_decrypt(String str) throws UnsupportedEncodingException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
        return new String(AESUtil.decryptAES(ParseSystemUtil.parseHexStr2Byte(str) , AESUtil.strKey2SecretKey(keys.getAES_Key())));
    }

    public void genNewKey(String RSASeed , String AESSeed) throws Exception {
        this.keys.setAES_Key(AESUtil.getStrKeyAES(AESSeed));
        Map<String , Object> pair = RSAUtil.genKeyPair(RSASeed);
        this.keys.setRSA_Public_Key(RSAUtil.getPublicKey(pair));
        this.keys.setRSA_Private_Key(RSAUtil.getPrivateKey(pair));
    }

    public CipherHelper(SecretKeys keys) {
        this.keys = keys;
    }

    public CipherHelper(String RSASeed , String AESSeed) throws Exception {
        this.keys = new SecretKeys("" , "" , "");
        this.genNewKey(RSASeed, AESSeed);
    }
}
