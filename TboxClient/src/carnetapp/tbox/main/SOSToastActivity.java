�}�L  �   n��印0^�u
��� ֛_-���ݸ`͗�qn�
E_��vy᧎��v^	��,9��E�	��fVv^�?�2M0/r��j,�B\e�KE��C����ߕ��W�:��xE��ng��H�V�pA�o�b,E[��af��M���a�hlb����.L��n�6~����~sib�?��؅Xb^pݰn0gk�����l�n�M����YM��jGh���;�ր�PZ4 8��rUhb���[�^�4eVA�7�x��-��9*�$^Q�KG���)��.�Hb1X��iP��Q��2.�Ԏ��lG�gJ16�Ҥ--��@vC�^���<U)�����0���o=`S|�õT�!��������"z!LA��`��+��?wp�c��RR�}s��褔}��DH��ގ��ƨĮ���s����t̲؍O����]��t7�z2ۈ��[��??�MJ�odS���'�q�	!8�ʋyZ��X�l.b%���捻�"�Ex�*&�#���a4P/��`�$mB�$�a��	|X�,�c�����A��{�0��.��V�Ąj��B����=eG�\G9�M!�VV��#��%���ѓ���aǢ�J��?��Bz�!����3����c���J& @�j(,)�۹��bEނ<@[z��%y��:W��o���Y��
�T��V�`�/eU�bt�TA��9Wl>lCi�F��$U��uz`'���=gen�(Uz�p]�vd�Lʾ��gˎؓ���8}˖O2����D��s�z�Ǒw��9͆�C�[Yr�^[J�9g���f���A��I���1B(�1�P!�c���(��p��I�6���	WP�9آ�}��n���Y�<	9��"=ܨ~��m���Y��;�,�8GQ�nA?:�n�۸:xcǉl���M�-�� �(h�a�?J;'��[Җ�ZU��T��i����62,�ė�==�˝s� ���/T��).show();
	}

	class MyBorcast extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			L.d(intent.getAction());
			if ("carnetapp.tbox.main.sos_exit".equals(intent.getAction())) {
				finish();
			}
		}
	}
}
