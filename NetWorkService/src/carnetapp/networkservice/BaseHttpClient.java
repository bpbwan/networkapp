�}�L  �   F��*P��u
��֛O�,��ݠ�����T�J��HA�_�6�L�����&�Hɸ'�(���Yx�G��`����[-e���S �^:���2#�������ޱ������W� 8�8����~?�KlHeJ�C���q3.C6p�gR�E��롊��^M�ջؤ�:ϫ�X��S��K��+Sbj���h,Cg����kF�\��~�5�q/��zi��:�_� <A9�@-8��|��_�,ev�>��p"D�P��pt&+��i��-�X����D��<���X7�0��/��#<�lG�gJ16�Ҥ--��@vC�^���<U)�����0���o=`S|�õT�!��������"z!LA��`��+��?wp�c��RR�}s��褔}��DH��ގ��ƨĮ���s����t̲؍O����]��t7�z2ۈ��[��??�MJ�odS���'�q�	!8�ʋyZ��X�		.readTimeout(NetWorkConstant.timeOut, TimeUnit.SECONDS);
			mOkHttpClient = builder.build();

		}
		return mOkHttpClient;
	}

	public abstract String post(String... strings);

	public abstract void url(String url);

	public abstract void postAsync(String... strings);

	public abstract void getAsync(String... strings);

	public abstract String get(String... strings);

	public abstract void execute();

	public abstract <T> void setCallBack(Class<T> t);
}
